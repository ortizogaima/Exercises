-- 1. Name of window with AD_Window_ID = ‘100’
SELECT Name FROM AD_Window WHERE AD_Window_ID = '100'

-- 2. Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of window with AD_Window_ID = ‘100’
UPDATE AD_Window SET Name = '--' WHERE AD_Window_ID = '100'

-- 3. List of all tabs in window with AD_Window_ID = ‘100’
SELECT * FROM AD_Tab WHERE AD_Window_ID = '100'

-- 4. List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab name and field name
SELECT AD_Tab.Name, AD_Field.Name FROM AD_Tab JOIN AD_Field HAVING AD_Tab.AD_Window_ID = '100' ORDER BY AD_Tab.Name,AD_Field.Name

-- 5. Name and number of tabs of all windows
SELECT AD_Tab.Name, Count(AD_Tab.AD_Window_ID) FROM AD_Tab
-- 6. List of all windows with its number of fields, sorting by number of fields starting by the windows with a higher number of them
SELECT AD_Window_ID,Count(AD_Field_ID) FROM AD_Window JOIN AD_Tab JOIN AD_Field ORDER BY 

-- 7. Windows with more than 5 tabs.
SELECT AD_Window FROM AD_Window JOIN AD_Tab HAVING Count(AD_Tab_ID) > 5