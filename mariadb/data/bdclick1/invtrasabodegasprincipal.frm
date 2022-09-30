TYPE=VIEW
query=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick1`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick1`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick1`.`invdevolucionesbodegas` join `bdclick1`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick1`.`invtrasaladosbodegas`.`codigo`))))
md5=1aed3986fd516468669cfd08ac45a69d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`invtrasaladosbodegas`.`salidas` AS `salidas`,(`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`invdevolucionesbodegas` join `invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `invtrasaladosbodegas`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick1`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick1`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick1`.`invdevolucionesbodegas` join `bdclick1`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick1`.`invtrasaladosbodegas`.`codigo`))))
mariadb-version=100135
