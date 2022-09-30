TYPE=VIEW
query=select `bdclick4`.`bdcosteo`.`Id` AS `Id`,`bdclick4`.`bdcosteo`.`fecha` AS `fecha`,`bdclick4`.`bdcosteo`.`total` AS `total`,`bdclick4`.`bdcosteo`.`usuario` AS `usuario`,`bdclick4`.`bdcosteo`.`unidades` AS `unidades`,`bdclick4`.`bdcosteo`.`tipo` AS `tipo`,`bdclick4`.`bdcosteo`.`producto` AS `producto`,`bdclick4`.`bdcosteo`.`anulada` AS `anulada`,`bdclick4`.`bdcosteo`.`bodega` AS `bodega` from `bdclick4`.`bdcosteo` where (`bdclick4`.`bdcosteo`.`anulada` = \'0\')
md5=2278a0c4a16902e2b3453f064d8d94a0
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcosteo`.`Id` AS `Id`,`bdclick4`.`bdcosteo`.`fecha` AS `fecha`,`bdclick4`.`bdcosteo`.`total` AS `total`,`bdclick4`.`bdcosteo`.`usuario` AS `usuario`,`bdclick4`.`bdcosteo`.`unidades` AS `unidades`,`bdclick4`.`bdcosteo`.`tipo` AS `tipo`,`bdclick4`.`bdcosteo`.`producto` AS `producto`,`bdclick4`.`bdcosteo`.`anulada` AS `anulada`,`bdclick4`.`bdcosteo`.`bodega` AS `bodega` from `bdclick4`.`bdcosteo` where (`bdclick4`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
