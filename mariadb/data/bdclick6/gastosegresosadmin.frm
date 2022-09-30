TYPE=VIEW
query=select sum(`bdclick6`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick6`.`bdegreso`.`fecha` AS `fecha`,`bdclick6`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick6`.`bdegreso`.`total`) AS `contGastos` from `bdclick6`.`bdegreso` where (`bdclick6`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick6`.`bdegreso`.`fecha`,`bdclick6`.`bdegreso`.`anulada` having (`bdclick6`.`bdegreso`.`anulada` = 0)
md5=61143ab755d241e9e4dc355e9129bda2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick6`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick6`.`bdegreso`.`fecha` AS `fecha`,`bdclick6`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick6`.`bdegreso`.`total`) AS `contGastos` from `bdclick6`.`bdegreso` where (`bdclick6`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick6`.`bdegreso`.`fecha`,`bdclick6`.`bdegreso`.`anulada` having (`bdclick6`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
