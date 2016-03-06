package object geom {
  
  implicit class double2DoubleOps(val d: Double) extends AnyVal {
    def *(that: V2) = that * d
    def *(that: V3) = that * d
  }
  
}