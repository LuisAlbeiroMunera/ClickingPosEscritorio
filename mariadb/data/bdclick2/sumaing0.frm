TYPE=VIEW
query=(select `bdclick2`.`bdcompra`.`ingreso` AS `ingreso`,sum(`bdclick2`.`bdcompra`.`total`) AS `total` from `bdclick2`.`bdcompra` group by `bdclick2`.`bdcompra`.`ingreso`)
md5=7ac4dcb68bbf7122aa615659e7c03b71
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=(select `bdcompra`.`ingreso` AS `ingreso`,sum(`bdcompra`.`total`) AS `total` from `bdcompra` group by `bdcompra`.`ingreso`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcompra`.`ingreso` AS `ingreso`,sum(`bdclick2`.`bdcompra`.`total`) AS `total` from `bdclick2`.`bdcompra` group by `bdclick2`.`bdcompra`.`ingreso`)
mariadb-version=100135
