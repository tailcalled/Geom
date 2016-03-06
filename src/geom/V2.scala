package geom

case class V2(x: Double, y: Double) {
  
  def +(that: V2) = V2(this.x + that.x, this.y + that.y)
  def *(s: Double) = V2(x * s, y * s)
  def /(s: Double) = V2(x / s, y / s)
  def *(that: V2) = this.x * that.x + this.y * that.y
  def unary_- = this * -1
  def -(that: V2) = this + -that
  override def toString = s"($x, $y)"
  def norm2 = this * this
  def norm = math.sqrt(norm2)
  def cp(that: V2) = this.x * that.y - that.x * this.y
  
}