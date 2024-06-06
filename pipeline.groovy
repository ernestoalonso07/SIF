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
            }
        }
        
        stage('Pruebas Unitarias') {
            steps {
                sh 'echo "Ejecutando pruebas unitarias..."'
            }
        }
        
        stage('Pruebas de Integración') {
            steps {
                sh 'echo "Ejecutando pruebas de integración..."'
            }
        }
        
        stage('Desplegar') {
            steps {
                sh 'echo "Desplegando proyecto..."'
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
