plugins {
    id("com.soundcloud.delect")
} 

allprojects {
    repositories {
        mavenCentral()
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "6.1.1"
}
