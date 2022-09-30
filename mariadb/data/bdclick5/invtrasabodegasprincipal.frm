TYPE=VIEW
query=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick5`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick5`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick5`.`invdevolucionesbodegas` join `bdclick5`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick5`.`invtrasaladosbodegas`.`codigo`))))
md5=508452a6eba0845594aee47fa21760c7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`invtrasaladosbodegas`.`salidas` AS `salidas`,(`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`invdevolucionesbodegas` join `invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `invtrasaladosbodegas`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `invdevolucionesbodegas`.`codigo` AS `codigo`,`invdevolucionesbodegas`.`entradas` AS `entradas`,`bdclick5`.`invtrasaladosbodegas`.`salidas` AS `salidas`,(`bdclick5`.`invtrasaladosbodegas`.`salidas` - `invdevolucionesbodegas`.`entradas`) AS `Expr1` from (`bdclick5`.`invdevolucionesbodegas` join `bdclick5`.`invtrasaladosbodegas` on((`invdevolucionesbodegas`.`codigo` = `bdclick5`.`invtrasaladosbodegas`.`codigo`))))
mariadb-version=100135
