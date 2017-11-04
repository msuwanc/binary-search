object Main extends App {
  val targetList = List(1,2,3,4,5,6,7,8,9,10)
  
  val value = 0
  
  val binarySearch: BinarySearch = new BinarySearch
  
  val result: Int = binarySearch.search(targetList, value)
  
  println(Console.GREEN + result + Console.RESET)
}