TYPE=VIEW
query=select `bdclick1`.`bdcosteo`.`Id` AS `Id`,`bdclick1`.`bdcosteo`.`fecha` AS `fecha`,`bdclick1`.`bdcosteo`.`total` AS `total`,`bdclick1`.`bdcosteo`.`usuario` AS `usuario`,`bdclick1`.`bdcosteo`.`unidades` AS `unidades`,`bdclick1`.`bdcosteo`.`tipo` AS `tipo`,`bdclick1`.`bdcosteo`.`producto` AS `producto`,`bdclick1`.`bdcosteo`.`anulada` AS `anulada`,`bdclick1`.`bdcosteo`.`bodega` AS `bodega` from `bdclick1`.`bdcosteo` where (`bdclick1`.`bdcosteo`.`anulada` = \'0\')
md5=bacb926f804f9b9da82c52ad188168af
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcosteo`.`Id` AS `Id`,`bdclick1`.`bdcosteo`.`fecha` AS `fecha`,`bdclick1`.`bdcosteo`.`total` AS `total`,`bdclick1`.`bdcosteo`.`usuario` AS `usuario`,`bdclick1`.`bdcosteo`.`unidades` AS `unidades`,`bdclick1`.`bdcosteo`.`tipo` AS `tipo`,`bdclick1`.`bdcosteo`.`producto` AS `producto`,`bdclick1`.`bdcosteo`.`anulada` AS `anulada`,`bdclick1`.`bdcosteo`.`bodega` AS `bodega` from `bdclick1`.`bdcosteo` where (`bdclick1`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
