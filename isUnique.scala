//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

object isUnique extends App {
 def isUnique(s:String):Boolean ={
  var chars:Map[Char,Char] = Map()
  var duplicate = true;
  for (i<-0 to s.length-1) {
    if (chars.contains(s.charAt(i))) {
        return false;
    }
    chars+=(s.charAt(i)->1);
  }
  return duplicate;
}
println(isUnique("saai"))
println(isUnique("sai"))
}
