package com.github.karina5005.memoryanalysis.services

import com.intellij.openapi.project.Project
import com.github.karina5005.memoryanalysis.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
