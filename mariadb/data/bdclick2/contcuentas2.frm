TYPE=VIEW
query=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `bdclick2`.`contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
md5=c676b2b28e7a070f1af50405d4d0c463
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `bdclick2`.`contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
mariadb-version=100135
