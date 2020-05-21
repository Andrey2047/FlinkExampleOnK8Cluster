Step to deploy cluster:

1. Install minikube https://kubernetes.io/ru/docs/tasks/tools/install-minikube/
2. Start minikube: `minikube start`
3. Package helm template: `helm package helm`
4. Deploy cluster: `helm install [chart_name] flink-1.4.0.tgz`
5. Use port-forward to access flink UI:
    - Get pod name: `kubectl get pod -l app=${DEPLOY_NAME}-helm -l component=jobmanager -o jsonpath="{.items[0].metadata.name}"`
    - Run port-forward: `kubectl port-forward pods/${JOB_MANAGER_POD_NAME} 8081:8081 where JOB_MANAGER_POD_NAME`
    - Open in browser: localhost:8081