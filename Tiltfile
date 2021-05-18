default_registry(
    'localhost:46697',
    host_from_cluster='k3d-registry:46697'
)

k8s_yaml(['bookstore-pg/kubernetes/deployment.yml', 'bookstore-pg/kubernetes/service.yml'])
k8s_resource('pg-deployment', port_forwards=5432)

custom_build('k3d-registry:46697/api',
  'cd bookstore-api; mvn spring-boot:build-image -D image=$EXPECTED_REF',
  ['bookstore-api/pom.xml', 'bookstore-api/target/classes'],
  live_update = [
    sync('bookstore-api/target/classes', '/workspace/BOOT-INF/classes')
  ]
)
k8s_yaml(['bookstore-api/kubernetes/deployment.yml', 'bookstore-api/kubernetes/service.yml'])
k8s_resource('api-deployment', resource_deps=['pg-deployment'])

docker_build('k3d-registry:46697/gui', 'bookstore-gui',
    entrypoint='npm run serve',
    live_update=[
        sync('bookstore-gui/src', '/home/app/src'),
        sync('bookstore-gui/public', '/home/app/public'),
        sync('bookstore-gui/package.json', '/home/app/package.json'),
        sync('bookstore-gui/package-lock.json', '/home/app/package-lock.json')
])
k8s_yaml(['bookstore-gui/kubernetes/deployment.yml', 'bookstore-gui/kubernetes/service.yml'])
k8s_resource('gui-deployment', port_forwards=8080, resource_deps=['api-deployment'])