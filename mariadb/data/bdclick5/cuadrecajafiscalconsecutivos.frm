TYPE=VIEW
query=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick5`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick5`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick5`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick5`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick5`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick5`.`bdcuadre` left join `bdclick5`.`primeroultimonc` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,`bdclick5`.`primeroultimonc`.`primeroNc`,`bdclick5`.`primeroultimonc`.`ultimoNc`,`bdclick5`.`bdcuadre`.`primeraFactura`,`bdclick5`.`bdcuadre`.`ultimaFactura`,`bdclick5`.`bdcuadre`.`primerAbono`,`bdclick5`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
md5=74b30623786b57a1a0a5fd700c1412bb
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick5`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick5`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick5`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick5`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick5`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick5`.`bdcuadre` left join `bdclick5`.`primeroultimonc` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,`bdclick5`.`primeroultimonc`.`primeroNc`,`bdclick5`.`primeroultimonc`.`ultimoNc`,`bdclick5`.`bdcuadre`.`primeraFactura`,`bdclick5`.`bdcuadre`.`ultimaFactura`,`bdclick5`.`bdcuadre`.`primerAbono`,`bdclick5`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
