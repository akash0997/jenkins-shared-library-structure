
def call() {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  'origin/master' ]],
        userRemoteConfigs: [[ url: 'https://github.com/SupremoAnkush/jenkins-shared-library-structure.git']]
    ])
  }
