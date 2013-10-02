package fpis.chapter3

class Variance
class SubVariance extends Variance
class SubSubVariance extends SubVariance

class MyList[T]
class MyList2[+T]
class MyList3[-T]

class Test {
  var list: MyList[SubVariance] = _
  list = new MyList[SubVariance]

  var list2: MyList2[SubVariance] = _
  list2 = new MyList2[SubVariance]
  list2 = new MyList2[SubSubVariance]

  var list3: MyList3[SubVariance] = _
  list3 = new MyList3[SubVariance]
  list3 = new MyList3[Variance]
}
