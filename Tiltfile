default_registry(
    'localhost:46697',
    host_from_cluster='k3d-registry:46697'
)

k8s_yaml(['bookstore-pg/kubernetes/deployment.yml', 'bookstore-pg/kubernetes/service.yml'])
k8s_resource('pg-deployment', port_forwards=5432)

docker_build('k3d-registry:46697/api', 'bookstore-api')
k8s_yaml(['bookstore-api/kubernetes/deployment.yml', 'bookstore-api/kubernetes/service.yml'])
k8s_resource('api-deployment', port_forwards=8090, resource_deps=['pg-deployment'])

live_update = [
    sync('bookstore-gui/src',
         '/home/app/src'),
    sync('bookstore-gui/public',
         '/home/app/public'),
    sync('bookstore-gui/package.json',
         '/home/app/package.json'),
    sync('bookstore-gui/package-lock.json',
         '/home/app/package-lock.json')
]

docker_build('k3d-registry:46697/gui',
             'bookstore-gui',
             entrypoint='npm run serve',
             live_update=live_update)

k8s_yaml(['bookstore-gui/kubernetes/deployment.yml', 'bookstore-gui/kubernetes/service.yml'])
k8s_resource('gui-deployment', port_forwards=8080, resource_deps=['api-deployment'])
