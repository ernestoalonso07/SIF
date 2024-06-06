pipeline {
    agent any

    stages {
        stage('Clonar Repositorio') {
            steps {
                git 'URL_del_repositorio'
            }
        }
        
        stage('Construir') {
            steps {
                sh 'echo "Construyendo proyecto..."'
                // Agrega aquí cualquier comando de construcción que necesites ejecutar
            }
        }
        
        stage('Pruebas Unitarias') {
            steps {
                sh 'echo "Ejecutando pruebas unitarias..."'
                // Agrega aquí comandos para ejecutar tus pruebas unitarias
            }
        }
        
        stage('Pruebas de Integración') {
            steps {
                sh 'echo "Ejecutando pruebas de integración..."'
                // Agrega aquí comandos para ejecutar tus pruebas de integración
            }
        }
        
        stage('Desplegar') {
            steps {
                sh 'echo "Desplegando proyecto..."'
                // Agrega aquí cualquier comando de despliegue que necesites ejecutar
            }
        }
    }
    
    post {
        success {
            echo '¡Pipeline ejecutado exitosamente!'
        }
        failure {
            echo '¡Pipeline fallido! Se requiere acción.'
        }
    }
}
