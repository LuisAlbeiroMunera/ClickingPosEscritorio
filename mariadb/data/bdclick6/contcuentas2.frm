TYPE=VIEW
query=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `bdclick6`.`contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
md5=415a71f54136ad25d9c40925bb5a9eea
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `contcuentas1`.`contrato` AS `contrato`,`contcuentas1`.`total2` AS `total2` from `bdclick6`.`contcuentas1` where (`contcuentas1`.`total2` <> \'\'))
mariadb-version=100135