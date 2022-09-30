TYPE=VIEW
query=select cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick3`.`bdcuadre`.`Id` AS `Id`,`bdclick3`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick3`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick3`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick3`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick3`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick3`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick3`.`bdcuadre` left join `bdclick3`.`primeroultimonc` on((`bdclick3`.`bdcuadre`.`Id` = `bdclick3`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed),`bdclick3`.`bdcuadre`.`Id`,`bdclick3`.`primeroultimonc`.`primeroNc`,`bdclick3`.`primeroultimonc`.`ultimoNc`,`bdclick3`.`bdcuadre`.`primeraFactura`,`bdclick3`.`bdcuadre`.`ultimaFactura`,`bdclick3`.`bdcuadre`.`primerAbono`,`bdclick3`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed)
md5=b7d83ea479b4abac94eb27b347e62511
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick3`.`bdcuadre`.`Id` AS `Id`,`bdclick3`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick3`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick3`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick3`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick3`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick3`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick3`.`bdcuadre` left join `bdclick3`.`primeroultimonc` on((`bdclick3`.`bdcuadre`.`Id` = `bdclick3`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed),`bdclick3`.`bdcuadre`.`Id`,`bdclick3`.`primeroultimonc`.`primeroNc`,`bdclick3`.`primeroultimonc`.`ultimoNc`,`bdclick3`.`bdcuadre`.`primeraFactura`,`bdclick3`.`bdcuadre`.`ultimaFactura`,`bdclick3`.`bdcuadre`.`primerAbono`,`bdclick3`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick3`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
