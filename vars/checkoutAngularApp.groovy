def call(String repoUrl = 'https://github.com/devops81/angular-app-sonarqube.git', String targetDir = 'C:/newcheckout') {
    echo "Checking out ${repoUrl} into ${targetDir}"
    dir(targetDir) {
        git url: repoUrl
    }
}
