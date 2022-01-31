package kizuki.ac;

public enum version {
  II(5),
  iI(47),
  Ii(107),
  ii(108),
  ll(109),
  lI(110),
  Il(210),
  LL(315),
  qq(316),
  qw(335),
  qe(338),
  qr(340),
  qt(393),
  qy(401),
  qu(404),
  qi(477),
  qo(480),
  qp(485),
  qa(490),
  qs(498),
  qd(573),
  qf(575),
  qg(578),
  qh(735),
  qj(736),
  qk(751),
  ql(753),
  qz(754),
  qx(999999999);
  
  int version;
  
  version(int paramInt1) {
    this.version = paramInt1;
  }
  
  public int II() {
    return this.version;
  }
}
