job('NodeJS Job') {
    scm {
        git('https://github.com/knysyy/jenkins-selenium.git') {
            node / gitConfigName('DSL User')
            node / gitConfigName('jenkins-dsl@example.com')
        }
    }
    triggers {
        csm('H/5 * * * *')
    }
    wrappers {
        nodejs('Node_v12')
    }
    steps {
        shell("npm install")
    }
}
