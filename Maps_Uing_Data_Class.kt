data class Week(val abbreviation: String, val fullName: String)

fun main() {
    val W1 = mapOf(
        "M" to Week("M", "Monday"),
        "Tue" to Week("Tue", "Tuesday"),
        "W" to Week("W", "Wednesday")
    )

    for ((abbreviation, day) in W1) {
        println("$abbreviation : ${day.fullName}")
    }

    val UpdatedWeek = W1.toMutableMap()
    UpdatedWeek["Thur"] = Week("Thur", "Thursday")
    UpdatedWeek["F"] = Week("F", "Friday")
    UpdatedWeek["Sat"] = Week("Sat", "Saturday")
    UpdatedWeek["Sun"] = Week("Sun", "Sunday")

    for((abbreviation,day) in UpdatedWeek){
        println("$abbreviation : ${day.fullName}")
    }
    println(UpdatedWeek.toSortedMap())
}
