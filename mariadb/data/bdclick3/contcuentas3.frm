TYPE=VIEW
query=(select `contcuentas2`.`contrato` AS `contrato`,count(`contcuentas2`.`total2`) AS `CuentaDetotal2` from `bdclick3`.`contcuentas2` group by `contcuentas2`.`contrato`)
md5=b4eea1819db9303916faf7110cf8c3d6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `contcuentas2`.`contrato` AS `contrato`,count(`contcuentas2`.`total2`) AS `CuentaDetotal2` from `contcuentas2` group by `contcuentas2`.`contrato`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `contcuentas2`.`contrato` AS `contrato`,count(`contcuentas2`.`total2`) AS `CuentaDetotal2` from `bdclick3`.`contcuentas2` group by `contcuentas2`.`contrato`)
mariadb-version=100135
