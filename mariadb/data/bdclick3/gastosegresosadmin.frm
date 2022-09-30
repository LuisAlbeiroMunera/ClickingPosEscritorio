TYPE=VIEW
query=select sum(`bdclick3`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick3`.`bdegreso`.`fecha` AS `fecha`,`bdclick3`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick3`.`bdegreso`.`total`) AS `contGastos` from `bdclick3`.`bdegreso` where (`bdclick3`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick3`.`bdegreso`.`fecha`,`bdclick3`.`bdegreso`.`anulada` having (`bdclick3`.`bdegreso`.`anulada` = 0)
md5=8bbb62cb9a3a17af61e11507c597e167
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick3`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick3`.`bdegreso`.`fecha` AS `fecha`,`bdclick3`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick3`.`bdegreso`.`total`) AS `contGastos` from `bdclick3`.`bdegreso` where (`bdclick3`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick3`.`bdegreso`.`fecha`,`bdclick3`.`bdegreso`.`anulada` having (`bdclick3`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
