TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`costo` AS `costo`,`bdclick4`.`bdproductos`.`L1` AS `L1`,(`bdclick4`.`bdproductos`.`L1` - `bdclick4`.`bdproductos`.`costo`) AS `U1`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L1` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R1`,`bdclick4`.`bdproductos`.`L2` AS `L2`,(`bdclick4`.`bdproductos`.`L2` - `bdclick4`.`bdproductos`.`costo`) AS `U2`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L2` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R2`,`bdclick4`.`bdproductos`.`L3` AS `L3`,(`bdclick4`.`bdproductos`.`L3` - `bdclick4`.`bdproductos`.`costo`) AS `U3`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L3` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R3`,`bdclick4`.`bdproductos`.`L4` AS `L4`,(`bdclick4`.`bdproductos`.`L4` - `bdclick4`.`bdproductos`.`costo`) AS `U4`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L4` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,`bdclick4`.`bdproductos`.`Proveedor` AS `Proveedor` from `bdclick4`.`bdproductos`)
md5=88f0d31dcc5f862bbe1ef61dd98f9ae3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=(select `bdproductos`.`idSistema` AS `idSistema`,`bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`costo` AS `costo`,`bdproductos`.`L1` AS `L1`,(`bdproductos`.`L1` - `bdproductos`.`costo`) AS `U1`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L1` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R1`,`bdproductos`.`L2` AS `L2`,(`bdproductos`.`L2` - `bdproductos`.`costo`) AS `U2`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L2` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R2`,`bdproductos`.`L3` AS `L3`,(`bdproductos`.`L3` - `bdproductos`.`costo`) AS `U3`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L3` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R3`,`bdproductos`.`L4` AS `L4`,(`bdproductos`.`L4` - `bdproductos`.`costo`) AS `U4`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L4` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdproductos`.`grupo` AS `Grupo`,`bdproductos`.`Proveedor` AS `Proveedor` from `bdproductos`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`costo` AS `costo`,`bdclick4`.`bdproductos`.`L1` AS `L1`,(`bdclick4`.`bdproductos`.`L1` - `bdclick4`.`bdproductos`.`costo`) AS `U1`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L1` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R1`,`bdclick4`.`bdproductos`.`L2` AS `L2`,(`bdclick4`.`bdproductos`.`L2` - `bdclick4`.`bdproductos`.`costo`) AS `U2`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L2` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R2`,`bdclick4`.`bdproductos`.`L3` AS `L3`,(`bdclick4`.`bdproductos`.`L3` - `bdclick4`.`bdproductos`.`costo`) AS `U3`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L3` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R3`,`bdclick4`.`bdproductos`.`L4` AS `L4`,(`bdclick4`.`bdproductos`.`L4` - `bdclick4`.`bdproductos`.`costo`) AS `U4`,if((`bdclick4`.`bdproductos`.`costo` = 0),100,round((((`bdclick4`.`bdproductos`.`L4` - `bdclick4`.`bdproductos`.`costo`) / `bdclick4`.`bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,`bdclick4`.`bdproductos`.`Proveedor` AS `Proveedor` from `bdclick4`.`bdproductos`)
mariadb-version=100135
