TYPE=VIEW
query=select cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`bdcuadre`.`contAbonos` AS `contAbonos`,`bdclick4`.`bdcuadre`.`totalAbonos` AS `totalAbonos`,`bdclick4`.`bdcuadre`.`totalCuotaInicial` AS `totalCuotaInicial`,`bdclick4`.`bdcuadre`.`contCuotaInicial` AS `contCuotaInicial`,(((`bdclick4`.`bdcuadre`.`totalAbonos` + `bdclick4`.`bdcuadre`.`totalCuotaInicial`) - `bdclick4`.`bdcuadre`.`gasto`) - `bdclick4`.`bdcuadre`.`totalncReembolsadas`) AS `totalOtros`,(((`bdclick4`.`bdcuadre`.`contAbonos` + `bdclick4`.`bdcuadre`.`contCuotaInicial`) + `bdclick4`.`bdcuadre`.`contGastos`) + `bdclick4`.`bdcuadre`.`contNcReembolsadas`) AS `contOtros`,`bdclick4`.`bdcuadre`.`gasto` AS `gasto`,`bdclick4`.`bdcuadre`.`contGastos` AS `contGastos`,`bdclick4`.`bdcuadre`.`totalncReembolsadas` AS `totalncReembolsadas`,`bdclick4`.`bdcuadre`.`contNcReembolsadas` AS `contNcReembolsadas`,`bdclick4`.`bdcuadre`.`gastosManuales` AS `gastosManuales`,`bdclick4`.`bdcuadre`.`abonosCartera` AS `abonosCartera`,`bdclick4`.`bdcuadre`.`abonosSepare` AS `abonosSepare`,`bdclick4`.`bdcuadre`.`ventasDomi` AS `ventasDomi`,`bdclick4`.`bdcuadre`.`itemDomi` AS `itemDomi` from `bdclick4`.`bdcuadre` group by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed),`bdclick4`.`bdcuadre`.`Id`,`bdclick4`.`bdcuadre`.`contAbonos`,`bdclick4`.`bdcuadre`.`totalAbonos`,`bdclick4`.`bdcuadre`.`totalCuotaInicial`,`bdclick4`.`bdcuadre`.`contCuotaInicial`,(((`bdclick4`.`bdcuadre`.`totalAbonos` + `bdclick4`.`bdcuadre`.`totalCuotaInicial`) - `bdclick4`.`bdcuadre`.`gasto`) - `bdclick4`.`bdcuadre`.`totalncReembolsadas`),(((`bdclick4`.`bdcuadre`.`contAbonos` + `bdclick4`.`bdcuadre`.`contCuotaInicial`) + `bdclick4`.`bdcuadre`.`contGastos`) + `bdclick4`.`bdcuadre`.`contNcReembolsadas`),`bdclick4`.`bdcuadre`.`gasto`,`bdclick4`.`bdcuadre`.`contGastos`,`bdclick4`.`bdcuadre`.`totalncReembolsadas`,`bdclick4`.`bdcuadre`.`contNcReembolsadas`,`bdclick4`.`bdcuadre`.`abonosCartera`,`bdclick4`.`bdcuadre`.`abonosSepare`,`bdclick4`.`bdcuadre`.`ventasDomi`,`bdclick4`.`bdcuadre`.`itemDomi` order by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed)
md5=12faac913c59c16caac1cf99c588d281
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`bdcuadre`.`contAbonos` AS `contAbonos`,`bdcuadre`.`totalAbonos` AS `totalAbonos`,`bdcuadre`.`totalCuotaInicial` AS `totalCuotaInicial`,`bdcuadre`.`contCuotaInicial` AS `contCuotaInicial`,(((`bdcuadre`.`totalAbonos` + `bdcuadre`.`totalCuotaInicial`) - `bdcuadre`.`gasto`) - `bdcuadre`.`totalncReembolsadas`) AS `totalOtros`,(((`bdcuadre`.`contAbonos` + `bdcuadre`.`contCuotaInicial`) + `bdcuadre`.`contGastos`) + `bdcuadre`.`contNcReembolsadas`) AS `contOtros`,`bdcuadre`.`gasto` AS `gasto`,`bdcuadre`.`contGastos` AS `contGastos`,`bdcuadre`.`totalncReembolsadas` AS `totalncReembolsadas`,`bdcuadre`.`contNcReembolsadas` AS `contNcReembolsadas`,`bdcuadre`.`gastosManuales` AS `gastosManuales`,`bdcuadre`.`abonosCartera` AS `abonosCartera`,`bdcuadre`.`abonosSepare` AS `abonosSepare`,`bdcuadre`.`ventasDomi` AS `ventasDomi`,`bdcuadre`.`itemDomi` AS `itemDomi` from `bdcuadre` group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`bdcuadre`.`contAbonos`,`bdcuadre`.`totalAbonos`,`bdcuadre`.`totalCuotaInicial`,`bdcuadre`.`contCuotaInicial`,(((`bdcuadre`.`totalAbonos` + `bdcuadre`.`totalCuotaInicial`) - `bdcuadre`.`gasto`) - `bdcuadre`.`totalncReembolsadas`),(((`bdcuadre`.`contAbonos` + `bdcuadre`.`contCuotaInicial`) + `bdcuadre`.`contGastos`) + `bdcuadre`.`contNcReembolsadas`),`bdcuadre`.`gasto`,`bdcuadre`.`contGastos`,`bdcuadre`.`totalncReembolsadas`,`bdcuadre`.`contNcReembolsadas`,`bdcuadre`.`abonosCartera`,`bdcuadre`.`abonosSepare`,`bdcuadre`.`ventasDomi`,`bdcuadre`.`itemDomi` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`bdcuadre`.`contAbonos` AS `contAbonos`,`bdclick4`.`bdcuadre`.`totalAbonos` AS `totalAbonos`,`bdclick4`.`bdcuadre`.`totalCuotaInicial` AS `totalCuotaInicial`,`bdclick4`.`bdcuadre`.`contCuotaInicial` AS `contCuotaInicial`,(((`bdclick4`.`bdcuadre`.`totalAbonos` + `bdclick4`.`bdcuadre`.`totalCuotaInicial`) - `bdclick4`.`bdcuadre`.`gasto`) - `bdclick4`.`bdcuadre`.`totalncReembolsadas`) AS `totalOtros`,(((`bdclick4`.`bdcuadre`.`contAbonos` + `bdclick4`.`bdcuadre`.`contCuotaInicial`) + `bdclick4`.`bdcuadre`.`contGastos`) + `bdclick4`.`bdcuadre`.`contNcReembolsadas`) AS `contOtros`,`bdclick4`.`bdcuadre`.`gasto` AS `gasto`,`bdclick4`.`bdcuadre`.`contGastos` AS `contGastos`,`bdclick4`.`bdcuadre`.`totalncReembolsadas` AS `totalncReembolsadas`,`bdclick4`.`bdcuadre`.`contNcReembolsadas` AS `contNcReembolsadas`,`bdclick4`.`bdcuadre`.`gastosManuales` AS `gastosManuales`,`bdclick4`.`bdcuadre`.`abonosCartera` AS `abonosCartera`,`bdclick4`.`bdcuadre`.`abonosSepare` AS `abonosSepare`,`bdclick4`.`bdcuadre`.`ventasDomi` AS `ventasDomi`,`bdclick4`.`bdcuadre`.`itemDomi` AS `itemDomi` from `bdclick4`.`bdcuadre` group by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed),`bdclick4`.`bdcuadre`.`Id`,`bdclick4`.`bdcuadre`.`contAbonos`,`bdclick4`.`bdcuadre`.`totalAbonos`,`bdclick4`.`bdcuadre`.`totalCuotaInicial`,`bdclick4`.`bdcuadre`.`contCuotaInicial`,(((`bdclick4`.`bdcuadre`.`totalAbonos` + `bdclick4`.`bdcuadre`.`totalCuotaInicial`) - `bdclick4`.`bdcuadre`.`gasto`) - `bdclick4`.`bdcuadre`.`totalncReembolsadas`),(((`bdclick4`.`bdcuadre`.`contAbonos` + `bdclick4`.`bdcuadre`.`contCuotaInicial`) + `bdclick4`.`bdcuadre`.`contGastos`) + `bdclick4`.`bdcuadre`.`contNcReembolsadas`),`bdclick4`.`bdcuadre`.`gasto`,`bdclick4`.`bdcuadre`.`contGastos`,`bdclick4`.`bdcuadre`.`totalncReembolsadas`,`bdclick4`.`bdcuadre`.`contNcReembolsadas`,`bdclick4`.`bdcuadre`.`abonosCartera`,`bdclick4`.`bdcuadre`.`abonosSepare`,`bdclick4`.`bdcuadre`.`ventasDomi`,`bdclick4`.`bdcuadre`.`itemDomi` order by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
