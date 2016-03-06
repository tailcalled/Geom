package geom

case class V3(x: Double, y: Double, z: Double) {
  
  def +(that: V3) = V3(this.x + that.x, this.y + that.y, this.z + that.z)
  def *(s: Double) = V3(x * s, y * s, z * s)
  def /(s: Double) = V3(x / s, y / s, z / s)
  def *(that: V3) = this.x * that.x + this.y * that.y + this.z * that.z
  def unary_- = this * -1
  def -(that: V3) = this + -that
  override def toString = s"($x, $y, $z)"
  def norm2 = this * this
  def norm = math.sqrt(norm2)
  def cp(that: V3) =
    V3(
      this.y * that.z - this.z * that.y,
      this.z * that.x - this.x * that.z,
      this.x * that.y - that.x * this.y
    )
  
}