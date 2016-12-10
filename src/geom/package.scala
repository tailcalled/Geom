package object geom {
  
  implicit class double2DoubleOps(val d: Double) extends AnyVal {
    def *(that: V2) = that * d
    def *(that: V3) = that * d
  }
  
  def center(a: V2, b: V2, c: V2) = {
    val p = (a + b) / 2
    val q = (b + c) / 2
    val pr = (a - b).cross
    val qr = (c - b).cross
    val alpha = ((p - q) cp pr) / (qr cp pr)
    q + alpha * qr
  }
  
}