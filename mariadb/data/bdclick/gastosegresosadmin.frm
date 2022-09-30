TYPE=VIEW
query=select sum(`bdclick`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick`.`bdegreso`.`fecha` AS `fecha`,`bdclick`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick`.`bdegreso`.`total`) AS `contGastos` from `bdclick`.`bdegreso` where (`bdclick`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick`.`bdegreso`.`fecha`,`bdclick`.`bdegreso`.`anulada` having (`bdclick`.`bdegreso`.`anulada` = 0)
md5=7236f6d187e7ea7ab961bd7120e4f02e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick`.`bdegreso`.`fecha` AS `fecha`,`bdclick`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick`.`bdegreso`.`total`) AS `contGastos` from `bdclick`.`bdegreso` where (`bdclick`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick`.`bdegreso`.`fecha`,`bdclick`.`bdegreso`.`anulada` having (`bdclick`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
