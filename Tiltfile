k8s_yaml(['bookstore-pg/kubernetes/deployment.yml', 'bookstore-pg/kubernetes/service.yml'])
k8s_resource('pg-deployment', port_forwards=5432)

docker_build('k3d-registry:46697/api', 'bookstore-api')
k8s_yaml(['bookstore-api/kubernetes/deployment.yml', 'bookstore-api/kubernetes/service.yml'])
k8s_resource('api-deployment', port_forwards=8090)

docker_build('k3d-registry:46697/gui', 'bookstore-gui')
k8s_yaml(['bookstore-gui/kubernetes/deployment.yml', 'bookstore-gui/kubernetes/service.yml'])
k8s_resource('gui-deployment', port_forwards=8080)