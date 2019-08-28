fun main() {
    val weight = 82 // вес 82 килограмма
    val height = 1.78 // рост 178
    val index = bodyMassIndex(weight, height)
    val verdict = when(index as Double) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..24.99 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        in 40.0..35.0 -> "Очень резкое ожирение"
        else -> "not rated"
    }
    println(verdict)
}

fun bodyMassIndex(weight: Int, height: Double): Any {
    return weight / (height * height)
}