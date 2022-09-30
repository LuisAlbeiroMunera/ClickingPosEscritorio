TYPE=VIEW
query=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick`.`invdevolucionesbodegas` join `bdclick`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick`.`invtrasaladosbodegas`.`codigo`))))
md5=e389b164b463205890afb1c7aace2111
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`invtrasaladosbodegas`.`salidas` AS `salidas`,(`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`invdevolucionesbodegas` join `invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `invtrasaladosbodegas`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick`.`invdevolucionesbodegas` join `bdclick`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick`.`invtrasaladosbodegas`.`codigo`))))
mariadb-version=100135
