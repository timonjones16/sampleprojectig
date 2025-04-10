pipeline {
    agent any
  	tools{
		maven 'maven1'
	}
	
    stages {
            stage('Compile and Clean') { 
                steps {
                       sh 'mvn compile'
                      }
            }
       
	        stage('Junit5 Test') { 
                 steps {
	                sh 'mvn test'
                  }
            }

	    stage('Jacoco Coverage Report') {
        	     steps{
            		//jacoco()
            		echo 'TestCoverage'
		          }
	        }
		stage('SonarQube'){
			steps{
				//sh label: '', script: '''mvn sonar:sonar \
				//-Dsonar.host.url=http://localhost:9000 \
			//	-Dsonar.login=squ_8530695a8134c03865b10fb062f50f2493c0986a'''
			echo 'Sonar Code Scanning '
				}	
   			}
        stage('Maven Build') { 
            steps {
                sh 'mvn clean install'
                  }
            }
stage('docker test') { 
	
	    steps {
        sh 'docker ps'
    }
}
        stage('Build Docker image'){
           steps {
		
                      //   	docker build -t nodejs-server -f Dockerfile.arg --build-arg UBUNTU_VERSION=18.04
		             //--build-arg CUDA_VERSION=10.0
                     //bat 'docker build -t  docker.repository.esi.adp.com/clientcentral/training:docker_jenkins_springboot:${BUILD_NUMBER} .'
           	    sh 'docker build -t  sampleproject .'
		         }
             }
	     stage('Docker Login'){
            steps {
		    
              echo "docker login from console"
               // docker login hub.docker.com -u arunajava567@gmail.com -p $aruna708*
		//    script {
               //     withCredentials([usernamePassword(credentialsId: DOCKER_CREDENTIALS_ID, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                //        sh 'docker login -u "$arunajava567@gmail.com" -p "$aruna708*"'
               //     }
		    
           // }                
        }
	     }
        stage('Docker Tag'){
            steps {
		    
          	      sh 'docker tag sampleproject  aruna708/sampleproject:latest'
            }                
        }
        stage('Docker Push'){
	
            steps { sh 'docker push aruna708/sampleproject:latest'
               
            }
        }
        stage('Docker deploy'){
	
            steps {
                sh 'docker run -itd -p  8086:8086 sampleproject'
             }
        }
    
     
    }
}
