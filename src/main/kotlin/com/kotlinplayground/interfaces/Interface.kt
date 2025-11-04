package org.modules.com.kotlinplayground.interfaces

import org.modules.com.kotlinplayground.classes.Course
// a class can implement multiple interfaces, but class cannot extend multiple classes

interface CourseRepository {

    fun getById(id : Int) : Course

    fun save(course : Course) : Int {
        println("course : $course")
        return course.id
    }

}
// class can implement multiple interfaces
interface Repository{
    fun getAll() : Any
}


class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "Daya")
    }

    override fun getAll(): Any {
        TODO("Not yet implemented")
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "Daya")
    }
    // we can override the functionlity of interface method in implementation classes

    override fun save(course: Course): Int {
        println("course in nosqlcourserepository : $course")
        return course.id
    }
}

fun main(){
    val sqlCourseRepository = SqlCourseRepository();
    val course = sqlCourseRepository.getById(2)
    println("courses : $course")
    val courseId = sqlCourseRepository.save(Course(5, "Kotlin", "Daya"))
    println("saved courseId is : $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository();
    val course1 = noSqlCourseRepository.getById(2)
    println("course1 : $course1")
    val courseId1 =  noSqlCourseRepository.save(Course(6, "Kotlin", "Daya"))
    println("saved courseId1 is : $courseId1")
}