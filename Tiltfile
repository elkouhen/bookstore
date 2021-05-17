k8s_yaml(['bookstore-pg/kubernetes/deployment.yml', 'bookstore-pg/kubernetes/service.yml'])

docker_build('k3d-registry:46697/api', 'bookstore-api')
k8s_yaml(['bookstore-api/kubernetes/deployment.yml', 'bookstore-api/kubernetes/service.yml'])

docker_build('k3d-registry:46697/gui', 'bookstore-gui')
k8s_yaml(['bookstore-gui/kubernetes/deployment.yml', 'bookstore-gui/kubernetes/service.yml'])