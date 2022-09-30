TYPE=VIEW
query=select sum(`bdclick1`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick1`.`bdegreso`.`fecha` AS `fecha`,`bdclick1`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick1`.`bdegreso`.`total`) AS `contGastos` from `bdclick1`.`bdegreso` where (`bdclick1`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick1`.`bdegreso`.`fecha`,`bdclick1`.`bdegreso`.`anulada` having (`bdclick1`.`bdegreso`.`anulada` = 0)
md5=8a6ff7e93e85307e2d0cb3731c9e9cbe
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick1`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick1`.`bdegreso`.`fecha` AS `fecha`,`bdclick1`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick1`.`bdegreso`.`total`) AS `contGastos` from `bdclick1`.`bdegreso` where (`bdclick1`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick1`.`bdegreso`.`fecha`,`bdclick1`.`bdegreso`.`anulada` having (`bdclick1`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
