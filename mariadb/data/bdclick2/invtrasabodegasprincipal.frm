TYPE=VIEW
query=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick2`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick2`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick2`.`invdevolucionesbodegas` join `bdclick2`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick2`.`invtrasaladosbodegas`.`codigo`))))
md5=ca0bade5d6b6930132271b9d9433f370
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`invtrasaladosbodegas`.`salidas` AS `salidas`,(`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`invdevolucionesbodegas` join `invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `invtrasaladosbodegas`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick2`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick2`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick2`.`invdevolucionesbodegas` join `bdclick2`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick2`.`invtrasaladosbodegas`.`codigo`))))
mariadb-version=100135
