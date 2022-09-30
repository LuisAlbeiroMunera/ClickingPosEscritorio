TYPE=VIEW
query=(select `contatrasadas2`.`contrato` AS `contrato`,count(`contatrasadas2`.`estado`) AS `CuentaDeestado` from `bdclick5`.`contatrasadas2` where (`contatrasadas2`.`estado` = \'ATRASADA\') group by `contatrasadas2`.`contrato`)
md5=e8cb4a930aad918b52e1a0d55ef5562b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `contatrasadas2`.`contrato` AS `contrato`,count(`contatrasadas2`.`estado`) AS `CuentaDeestado` from `contatrasadas2` where (`contatrasadas2`.`estado` = \'ATRASADA\') group by `contatrasadas2`.`contrato`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `contatrasadas2`.`contrato` AS `contrato`,count(`contatrasadas2`.`estado`) AS `CuentaDeestado` from `bdclick5`.`contatrasadas2` where (`contatrasadas2`.`estado` = \'ATRASADA\') group by `contatrasadas2`.`contrato`)
mariadb-version=100135
