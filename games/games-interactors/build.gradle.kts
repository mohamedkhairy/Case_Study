apply {
    from("$rootDir/library-build.gradle")
}

dependencies {

    "implementation"(project(Modules.core))
    "implementation"(project(Modules.gamesDataSource))
    "implementation"(project(Modules.gamesDomain))

    "implementation"(Kotlinx.coroutinesCore) // need for flows

    "testImplementation"(project(Modules.gamesDataSourceTest))
    "testImplementation"(Junit.junit4)
    "testImplementation"(Ktor.ktorClientMock)
    "testImplementation"(Ktor.clientSerialization)
}