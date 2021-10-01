package com.github.olgalupuleac.intellijideaplugin.services

import com.intellij.openapi.project.Project
import com.github.olgalupuleac.intellijideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
