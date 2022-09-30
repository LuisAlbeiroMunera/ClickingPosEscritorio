TYPE=VIEW
query=select `bdclick6`.`bdcosteo`.`Id` AS `Id`,`bdclick6`.`bdcosteo`.`fecha` AS `fecha`,`bdclick6`.`bdcosteo`.`total` AS `total`,`bdclick6`.`bdcosteo`.`usuario` AS `usuario`,`bdclick6`.`bdcosteo`.`unidades` AS `unidades`,`bdclick6`.`bdcosteo`.`tipo` AS `tipo`,`bdclick6`.`bdcosteo`.`producto` AS `producto`,`bdclick6`.`bdcosteo`.`anulada` AS `anulada`,`bdclick6`.`bdcosteo`.`bodega` AS `bodega` from `bdclick6`.`bdcosteo` where (`bdclick6`.`bdcosteo`.`anulada` = \'0\')
md5=8c1d55ebc1a774e37d0c39a1be76f572
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcosteo`.`Id` AS `Id`,`bdclick6`.`bdcosteo`.`fecha` AS `fecha`,`bdclick6`.`bdcosteo`.`total` AS `total`,`bdclick6`.`bdcosteo`.`usuario` AS `usuario`,`bdclick6`.`bdcosteo`.`unidades` AS `unidades`,`bdclick6`.`bdcosteo`.`tipo` AS `tipo`,`bdclick6`.`bdcosteo`.`producto` AS `producto`,`bdclick6`.`bdcosteo`.`anulada` AS `anulada`,`bdclick6`.`bdcosteo`.`bodega` AS `bodega` from `bdclick6`.`bdcosteo` where (`bdclick6`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
