package com.github.ninods.horstplugin.services

import com.intellij.openapi.project.Project
import com.github.ninods.horstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
