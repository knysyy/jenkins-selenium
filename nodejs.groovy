job('NodeJS Job') {
    wrappers {
        nodejs('Node_v12')
    }
    steps {
        shell("npm install")
        shell("npm start")
    }
}
