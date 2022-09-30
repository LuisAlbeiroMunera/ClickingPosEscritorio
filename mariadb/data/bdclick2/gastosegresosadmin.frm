TYPE=VIEW
query=select sum(`bdclick2`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick2`.`bdegreso`.`fecha` AS `fecha`,`bdclick2`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick2`.`bdegreso`.`total`) AS `contGastos` from `bdclick2`.`bdegreso` where (`bdclick2`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick2`.`bdegreso`.`fecha`,`bdclick2`.`bdegreso`.`anulada` having (`bdclick2`.`bdegreso`.`anulada` = 0)
md5=608f78674e3dbdc3c27faee45f6b5206
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick2`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick2`.`bdegreso`.`fecha` AS `fecha`,`bdclick2`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick2`.`bdegreso`.`total`) AS `contGastos` from `bdclick2`.`bdegreso` where (`bdclick2`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick2`.`bdegreso`.`fecha`,`bdclick2`.`bdegreso`.`anulada` having (`bdclick2`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
