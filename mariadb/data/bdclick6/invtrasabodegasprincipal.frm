TYPE=VIEW
query=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick6`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick6`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick6`.`invdevolucionesbodegas` join `bdclick6`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick6`.`invtrasaladosbodegas`.`codigo`))))
md5=806e7b0ff7f5e2165e0946010c4d3806
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`invtrasaladosbodegas`.`salidas` AS `salidas`,(`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`invdevolucionesbodegas` join `invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `invtrasaladosbodegas`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick6`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick6`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick6`.`invdevolucionesbodegas` join `bdclick6`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick6`.`invtrasaladosbodegas`.`codigo`))))
mariadb-version=100135
