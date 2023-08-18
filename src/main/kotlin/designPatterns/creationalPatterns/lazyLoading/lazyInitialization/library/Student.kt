package designPatterns.creationalPatterns.lazyLoading.lazyInitialization.library

data class Student(val rollNo: String, val name: String) {

    //1st way of creating a lazily initialized object(Kotlin way)
    val teachers by lazy { getTeachersList() }

    //2nd way of creating a lazily initialized object
    var subjects: List<String>? = null
        get() {
            if (field == null) {
                synchronized(this) {
                    if (field == null) {
                        field = getSubjectsList()
                    }
                }
            }

            return field
        }

    //3rd way of creating a lazily initialized object
    private var optionalSubjects: List<String>? = null
    fun getOptionalSubjects(): List<String> {
        if (optionalSubjects == null) {
            synchronized(this) {
                if (optionalSubjects == null) {
                    optionalSubjects = getOptionalSubjectsList()
                }
            }
        }

        return optionalSubjects!!
    }


    private fun getSubjectsList(): List<String> {
        println("Subjects list created for $this")
        return listOf(
            "Eng",
            "Maths",
            "Science",
        )
    }

    private fun getOptionalSubjectsList(): List<String> {
        println("Optional subjects list created for $this")
        return listOf(
            "Computer",
            "P.Ed.",
            "Hindi",
        )
    }

    private fun getTeachersList(): List<String> {
        println("Teachers list created for $this")
        return listOf(
            "Teacher 1",
            "Teacher 2",
            "Teacher 3"
        )
    }
}