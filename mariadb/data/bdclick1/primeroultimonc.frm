TYPE=VIEW
query=select cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre`,`cajaordenadaparacuadrenc`.`cuadre` AS `cuadre`,min(`cajaordenadaparacuadrenc`.`ordenId`) AS `primeroNc`,max(`cajaordenadaparacuadrenc`.`ordenId`) AS `ultimoNc`,count(`cajaordenadaparacuadrenc`.`cuadre`) AS `contNc` from `bdclick1`.`cajaordenadaparacuadrenc` group by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed),`cajaordenadaparacuadrenc`.`cuadre` order by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed)
md5=7f5bb198456b046632d65459b7036816
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre`,`cajaordenadaparacuadrenc`.`cuadre` AS `cuadre`,min(`cajaordenadaparacuadrenc`.`ordenId`) AS `primeroNc`,max(`cajaordenadaparacuadrenc`.`ordenId`) AS `ultimoNc`,count(`cajaordenadaparacuadrenc`.`cuadre`) AS `contNc` from `cajaordenadaparacuadrenc` group by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed),`cajaordenadaparacuadrenc`.`cuadre` order by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre`,`cajaordenadaparacuadrenc`.`cuadre` AS `cuadre`,min(`cajaordenadaparacuadrenc`.`ordenId`) AS `primeroNc`,max(`cajaordenadaparacuadrenc`.`ordenId`) AS `ultimoNc`,count(`cajaordenadaparacuadrenc`.`cuadre`) AS `contNc` from `bdclick1`.`cajaordenadaparacuadrenc` group by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed),`cajaordenadaparacuadrenc`.`cuadre` order by cast(substr(`cajaordenadaparacuadrenc`.`cuadre`,8,100) as signed)
mariadb-version=100135
