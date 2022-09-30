TYPE=VIEW
query=select `bdclick2`.`bdcosteo`.`Id` AS `Id`,`bdclick2`.`bdcosteo`.`fecha` AS `fecha`,`bdclick2`.`bdcosteo`.`total` AS `total`,`bdclick2`.`bdcosteo`.`usuario` AS `usuario`,`bdclick2`.`bdcosteo`.`unidades` AS `unidades`,`bdclick2`.`bdcosteo`.`tipo` AS `tipo`,`bdclick2`.`bdcosteo`.`producto` AS `producto`,`bdclick2`.`bdcosteo`.`anulada` AS `anulada`,`bdclick2`.`bdcosteo`.`bodega` AS `bodega` from `bdclick2`.`bdcosteo` where (`bdclick2`.`bdcosteo`.`anulada` = \'0\')
md5=a6244420556d462886d5baf6a8963de2
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcosteo`.`Id` AS `Id`,`bdclick2`.`bdcosteo`.`fecha` AS `fecha`,`bdclick2`.`bdcosteo`.`total` AS `total`,`bdclick2`.`bdcosteo`.`usuario` AS `usuario`,`bdclick2`.`bdcosteo`.`unidades` AS `unidades`,`bdclick2`.`bdcosteo`.`tipo` AS `tipo`,`bdclick2`.`bdcosteo`.`producto` AS `producto`,`bdclick2`.`bdcosteo`.`anulada` AS `anulada`,`bdclick2`.`bdcosteo`.`bodega` AS `bodega` from `bdclick2`.`bdcosteo` where (`bdclick2`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
