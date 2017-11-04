class BinarySearch {
  def search(targetList: List[Int], value: Int): Int = {
    var result: Int = -1

    val middle: Int = targetList.length / 2

    if(targetList(middle) == value) {
      result = value
    } else if(targetList.length <= 1) {

    } else {
      if(value > targetList(middle)) {
        val newList: List[Int] = targetList.slice(middle, targetList.length)
        
        val finalResult: Int = search(newList, value)
        result = finalResult
      } else {
        val newList: List[Int] = targetList.slice(0, middle)

        val finalResult: Int = search(newList, value)
        result = finalResult
      }
    }

    result
  }
}