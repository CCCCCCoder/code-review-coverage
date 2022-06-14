package com.github.ccccccoder.codereviewcoverage.services

import com.intellij.openapi.project.Project
import com.github.ccccccoder.codereviewcoverage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
